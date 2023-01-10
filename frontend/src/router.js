
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderMngManager from "./components/listers/OrderMngCards"
import OrderMngDetail from "./components/listers/OrderMngDetail"

import SelectItemView from "./components/SelectItemView"
import SelectItemViewDetail from "./components/SelectItemViewDetail"
import SelectOrderView from "./components/SelectOrderView"
import SelectOrderViewDetail from "./components/SelectOrderViewDetail"
import DeliveryMngManager from "./components/listers/DeliveryMngCards"
import DeliveryMngDetail from "./components/listers/DeliveryMngDetail"

import StockMngManager from "./components/listers/StockMngCards"
import StockMngDetail from "./components/listers/StockMngDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orderMngs',
                name: 'OrderMngManager',
                component: OrderMngManager
            },
            {
                path: '/orderMngs/:id',
                name: 'OrderMngDetail',
                component: OrderMngDetail
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
                path: '/deliveryMngs',
                name: 'DeliveryMngManager',
                component: DeliveryMngManager
            },
            {
                path: '/deliveryMngs/:id',
                name: 'DeliveryMngDetail',
                component: DeliveryMngDetail
            },

            {
                path: '/stockMngs',
                name: 'StockMngManager',
                component: StockMngManager
            },
            {
                path: '/stockMngs/:id',
                name: 'StockMngDetail',
                component: StockMngDetail
            },



    ]
})
