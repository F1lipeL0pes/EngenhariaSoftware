from fastapi import FastAPI

app = FastAPI()

@app.get("/somar")
def somar(a: float, b: float):
    return {
        "resultado": a + b
 }

@app.get("/subtrair")
def subtrair(a: float, b: float):
    return {
        "resultado": a - b
 }

@app.get("/multiplicar")
def multiplicar(a: float, b: float):
    return {
        "resultado": a * b
 }

@app.get("/dividir")
def dividir(a: float, b: float):
    return {
        "resultado": a / b
 }
