from datetime import datetime, timedelta


fecha_inicial = datetime(2025, 1, 2)
dias_a_sumar = 2048*2


fecha_resultante = fecha_inicial + timedelta(days=dias_a_sumar)


fecha_resultante.strftime('%d de %B del %Y')
