import { Link } from "react-router-dom"
import ButtonAtom from "../../atoms/ButtonAtom"

export default function NoUserLoggedIn() {
    return (
    <>
        <Link to="/register">
            <ButtonAtom buttonType="register"/>
        </Link>
        <Link to="/login">
            <ButtonAtom buttonType="login" />
        </Link>
    </>
    )
}