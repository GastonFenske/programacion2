numeros: list = []
operadores: list = []

def operacion(numeros: list) -> int:
    return sum(numeros)

def ingresar_numero() -> int:
    num = int(input('Ingrese un numero: '))
    return num

def ingresar_operador() -> int:
    ope = str(input('Ingrese un operador (+, -, *, /, =): '))
    return ope

def calc(numeros: list) -> int:
    list_to_send: list = [numeros.pop(0)]
    result: int = 0
    for i in range(len(operadores)):
        list_to_send.append(numeros.pop(0))
        result = operacion(list_to_send)
        list_to_send.clear()
        list_to_send.append(result)
    return result

def main() -> None:
    while True:
        num = ingresar_numero()
        ope = ingresar_operador()
        numeros.append(num)
        if ope == '=':
            print(f'El resultado es: {calc(numeros=numeros)}')
            break
        operadores.append(ope)

if __name__ == '__main__':
    main()
