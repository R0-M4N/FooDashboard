import { useState, useEffect } from "react";
import IngredientSelect from "./IngredientSelect";


function IngredientSwapper() {
    const [ingredients, setIngredients] = useState([]);
    const  getIngredientUrl = "http://localhost:8080/ingredients";

    useEffect(() => {
            fetch(getIngredientUrl, {method: "GET"})
            .then(response => response.json())
            .then(ingredientData => setIngredients(ingredientData))
            .catch(error => console.log(error))
    },[]);

    return (
        <>
            <IngredientSelect ingredients={ingredients} />
        </>
    )
}

export default IngredientSwapper
