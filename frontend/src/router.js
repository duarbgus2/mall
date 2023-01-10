
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderManager from "./components/listers/OrderCards"
import OrderDetail from "./components/listers/OrderDetail"

import SelectItemView from "./components/SelectItemView"
import SelectItemViewDetail from "./components/SelectItemViewDetail"
import SelectOrderView from "./components/SelectOrderView"
import SelectOrderViewDetail from "./components/SelectOrderViewDetail"
import DeliveryManager from "./components/listers/DeliveryCards"
import DeliveryDetail from "./components/listers/DeliveryDetail"

import StockManager from "./components/listers/StockCards"
import StockDetail from "./components/listers/StockDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders',
                name: 'OrderManager',
                component: OrderManager
            },
            {
                path: '/orders/:id',
                name: 'OrderDetail',
                component: OrderDetail
            },

            {
                path: '/selectItems',
                name: 'SelectItemView',
                component: SelectItemView
            },
            {
                path: '/selectItems/:id',
                name: 'SelectItemViewDetail',
                component: SelectItemViewDetail
            },
            {
                path: '/selectOrders',
                name: 'SelectOrderView',
                component: SelectOrderView
            },
            {
                path: '/selectOrders/:id',
                name: 'SelectOrderViewDetail',
                component: SelectOrderViewDetail
            },
            {
                path: '/deliveries',
                name: 'DeliveryManager',
                component: DeliveryManager
            },
            {
                path: '/deliveries/:id',
                name: 'DeliveryDetail',
                component: DeliveryDetail
            },

            {
                path: '/stocks',
                name: 'StockManager',
                component: StockManager
            },
            {
                path: '/stocks/:id',
                name: 'StockDetail',
                component: StockDetail
            },



    ]
})
