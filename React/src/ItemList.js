
import './App.css';
import { useEffect, useState } from 'react';
import service from './service';
import alertify from 'alertifyjs';
import { Button, Table } from 'reactstrap';
import { useNavigate } from 'react-router-dom'

function ItemList() {
    const [item, setItem] = useState([])
    let navigate = useNavigate();

    useEffect(() => {
        service.list().then(result => {
            setItem(result.data)
        })
    })

    const deleteItem = (id) => {
        let del = { id }
        service.delete(del).then(alertify.success("Item deleted", 1.5)).catch();
    }

    const add = () => {
        navigate('/add')

    }
    return (
        <div>
            <div><button onClick={()=> add()} className="btn btn-success" >Add a new note</button></div>
            <table className="table">
                <thead>
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Title</th>
                        <th scope="col">Content</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>

                    {
                        item.map((item, index) => (
                            <tr key={item.id}>
                                <th scope="row">{index}</th>
                                <td>{item.title}</td>
                                <td>{item.content}</td>
                                <td><button onClick={() => deleteItem(item.id)} className="btn btn-danger">delete</button></td>
                            </tr>

                        ))
                    }
                </tbody>
            </table>
        </div>
    );
}

export default ItemList;
