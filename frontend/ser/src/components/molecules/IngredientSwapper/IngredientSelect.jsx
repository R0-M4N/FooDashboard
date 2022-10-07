import {FormControl, MenuItem, TextField} from '@mui/material'
import ShowResult from './ShowResult';
import { useState } from "react";

const IngredientSelect = ({ ingredients }) => {
  const [exchangedIngredient, setExchangedIngredient] = useState("");

  const handleChange = event => {
    const value = event.target.value;
    const URL = "http://localhost:8080/ingredients/swap/" + value;
    fetch(URL, {method: 'GET'})
      .then((response) => response.json())
      .then((data) => setExchangedIngredient(data))
}
  return (
    <>
    <FormControl sx={{minWidth:200, paddingLeft: 50, top: 80}}>
    <TextField
          variant="outlined"
          value={ingredients.id}
          onChange={handleChange}
          className="select-container"
          select
          label="Select your ingredient"
        >
            {ingredients.map ((ingredient) =>
            <MenuItem key={ingredient.id} value={ingredient.id}>
                {ingredient.name}
            </MenuItem>
            )}
          </TextField>
    </FormControl>
    <ShowResult result={exchangedIngredient}/>
    </>
  )
}

export default IngredientSelect