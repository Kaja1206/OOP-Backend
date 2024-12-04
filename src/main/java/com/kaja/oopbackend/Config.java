package com.kaja.oopbackend;

public class Config {
    private int maxTickets;
    private int maxVendors;
    private int maxCustomers;

    public Config(int maxTickets, int maxVendors, int maxCustomers) {
        this.maxTickets = maxTickets;
        this.maxVendors = maxVendors;
        this.maxCustomers = maxCustomers;
    }

    public int getMaxTickets() {
        return maxTickets;
    }

    public void setMaxTickets(int maxTickets) {
        this.maxTickets = maxTickets;
    }

    public int getMaxVendors() {
        return maxVendors;
    }

    public void setMaxVendors(int maxVendors) {
        this.maxVendors = maxVendors;
    }

    public int getMaxCustomers() {
        return maxCustomers;
    }

    public void setMaxCustomers(int maxCustomers) {
        this.maxCustomers = maxCustomers;
    }
}
