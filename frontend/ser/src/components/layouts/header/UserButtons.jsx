import NoUserLoggedIn from "./NoUserLoggedIn";
import UserLoggedIn from "./UserLoggedIn";

export default function UserButtons() {
    const user = null;
    //check for user later #TODO
    if (!user) {
        return (
            <NoUserLoggedIn />
        )
    } else {
        return (
            <UserLoggedIn />
        )
    }
}