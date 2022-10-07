import { Button } from "@mui/material"

const ShowResult = ({result}) => {
        return (
            <Button style={{top: 80}}>
                {result.name ? result.name : ""}
            </Button>
        )
}

export default ShowResult;