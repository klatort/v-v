class OrderProcessor:
    def __init__(self, order, user, available_products):
        self.order = order
        self.user = user
        self.available_products = available_products

    def process_order(self):
        total_price = 0
        discount = 0
        
        if self.user['type'] == 'premium':
            discount = 0.15  # Descuento del 15%
        elif self.user['type'] == 'regular' and self.order['items_count'] > 5:
            discount = 0.10  # Descuento del 10% para usuarios regulares con más de 5 artículos

        for item in self.order['items']:
            product_id = item['product_id']
            quantity = item['quantity']
            
            if product_id in self.available_products:
                product_price = self.available_products[product_id]['price']
                
                if self.available_products[product_id]['stock'] >= quantity:
                    total_price += product_price * quantity
                else:
                    print(f"Stock insuficiente para el producto {product_id}")
            else:
                print(f"Producto {product_id} no disponible")

        if discount > 0:
            total_price -= total_price * discount
        
        tax = total_price * 0.18  # Impuesto del 18%
        total_price += tax

        if total_price > 100:
            shipping_cost = 0
        else:
            shipping_cost = 10  # Costo fijo de envío
        total_price += shipping_cost

        return total_price
