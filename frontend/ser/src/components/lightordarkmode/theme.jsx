import { createGlobalStyle } from "styled-components";

export const lightTheme = {
    body: "#fff",
    frontColor: "#000"
};

export const darkTheme = {
    body: "#000",
    frontColor: "#fff",
};

export const GlobalStyles = createGlobalStyle`
    body{
        background-color: ${props => props.theme.body};
    }
    `