import axios from "axios";

const list = "http://localhost:8080/list"
const del = "http://localhost:8080/delete/"
const add = "http://localhost:8080/item"

class ItemService{
    list(){
        return axios.get(list)
    }

    delete (item) {
        return axios.delete(del,{
            data: {
                    id: item.id
                }
        })
    }

    add(item){
        return axios.post(add, item)
    }
}

export default new ItemService()