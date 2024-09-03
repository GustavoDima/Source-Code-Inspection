peso_peixe = float(input('digite o peso do peixe em kg:  '))
if peso_peixe > 50.00:
    excedente = (peso_peixe - 50.00)
    multa = excedente *4
    print(f' peso excedente R$ {excedente:.1f}')
    print(f' multa {multa:.2f}')
else:
    print('dentro do regulameto')
