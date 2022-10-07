import { Link } from "react-router-dom";
import ButtonAtom from "../../atoms/ButtonAtom";

export default function UserLoggedIn() {
    return (
        <>
            <Link to="/logout"> 
                <ButtonAtom buttonType="logout"/>
            </Link>

            <ButtonAtom buttonType="profile"/>
        </>
    )
}