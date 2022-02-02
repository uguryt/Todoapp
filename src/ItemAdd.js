import { useState } from "react"
import { useNavigate } from "react-router-dom"
import service from "./service"

export default function ItemAdd() {
    const [title, setTitle] = useState("")
    const [content, setContent] = useState("")
    let navigate = useNavigate()

    const add = () => {
        let item = {title : title, content: content}
        service.add(item).then().catch()
        navigate('/')
    }

    return (
    <div>
        <form>
            <label>Add an item</label>
            <br/>
            <input
                onChange={e => setTitle(e.target.value)}
                placeholder="Title"
            />
            <br/>
            <input
                onChange={e => setContent(e.target.value)}
                placeholder="Content"
            />
            <br/>
            <button className="btn btn-success" onClick = {()=> add()}>Add an item</button>
        </form>
    </div>
    )

}
