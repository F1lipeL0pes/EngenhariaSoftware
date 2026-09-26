from xmlrpc.client import ServerProxy
from concurrent.futures import ThreadPoolExecutor

def executar(operacao, a, b):
    servidor = ServerProxy("http://localhost:9000")
    if operacao == "somar":
        return servidor.somar(a, b)
    elif operacao == "subtrair":
        return servidor.subtrair(a, b)
    elif operacao == "multiplicar":
        return servidor.multiplicar(a, b)
    elif operacao == "dividir":
        return servidor.dividir(a, b)

operacoes = [
    ("somar", 10, 20),
    ("subtrair", 50, 20),
    ("multiplicar", 10, 5),
    ("dividir", 100, 4)
]


with ThreadPoolExecutor(max_workers=4) as executor:
    resultados = executor.map(
        lambda op: executar(*op),
        operacoes
    )
    for resultado in resultados:
        print("Resultado:", resultado)
