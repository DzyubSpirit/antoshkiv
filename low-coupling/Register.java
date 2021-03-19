package GraspPatterns;


import java.util.*;
import java.util.stream.Collectors;

public class Register {

    List<Sale> sales;
    Catalog catalog;

    Register(ArrayList<Sale> sales) {
        this.sales = sales;

    }

    public double getTotalBalance(boolean hasTax) {
        double total = 0.0;
        for (Sale item : sales) {
            total = total + item.getTotal(hasTax);
        }
        return total;

    }

    public String makePayment(double amount, int saleId) {
        List<Sale> selectedSale = sales.stream().filter(sl -> sl.getID() == saleId).collect(Collectors.toList());
        if (selectedSale.isEmpty()) throw new NoSuchElementException("Sale with id " + saleId + " nor found!!");

        Sale current = selectedSale.get(0);
        current.createPayment(amount);

        return current.isPaid() ? "PAID" : "NOT PAID";
    }

    public String makePayment(Payment payment, int saleId) {
        List<Sale> selectedSale = sales.stream().filter(sl -> sl.getID() == saleId).collect(Collectors.toList());
        if (selectedSale.isEmpty()) throw new NoSuchElementException("Sale with id " + saleId + " nor found!!");

        Sale current = selectedSale.get(0);
        current.receivePayment(payment);

        return current.isPaid() ? "PAID" : "NOT PAID";
    }


    public void addItemToSale(Sale sale, int itemID, int quantity, double disc) {
        if (quantity > 0) {
            ProductDesc productDesc = catalog.searchProdDesc(itemID);
            sale.addLineItem(productDesc, quantity, disc);
        }
    }
}
