from fastapi import FastAPI

app = FastAPI()

produtos = {
1: {"nome": "Notebook", "preco": 3500},
2: {"nome": "Mouse", "preco": 100}
}

@app.get("/produtos/{id}")
def buscar_produto(id: int):
    return produtos.get(id)
