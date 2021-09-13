import { useEffect, useState } from "react";
const useFetch = (url) => {
    const [data, setData] = useState(null);
    const [isPending, setIsPending] = useState(true);
    const [error, setError] = useState(null);
    useEffect(()=>{
        const abortCtrl = new AbortController();
        setTimeout(() => {
            fetch(url, {signal:abortCtrl.signal})
            .then(res=>{
                return res.json();
            })
            .then(data=>{
                setIsPending(false);
                setData(data);
                setError(null);
            })
            .catch(err => {
                if(err.name === 'AbortError'){
                    console.log("Premptive abortion for fetch task");
                }
                else{
                    setIsPending(false);
                    setError(err.message);
                }
            })
        }, 1000);
        return ()=> abortCtrl.abort();
    }, [url])
    return {data, isPending, error};
}

export default useFetch;
