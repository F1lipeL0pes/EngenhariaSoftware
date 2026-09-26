import requests

a = 10
b = 20

url = "http://127.0.0.1:8000/somar"

parametros = {
"a": a,
"b": b
}

resposta = requests.get(
url,
params=parametros
)

dados = resposta.json()

print("Resultado:", dados["resultado"])
