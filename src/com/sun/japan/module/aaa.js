import App from "./vue/App";

var name = "小明"

var flag = true

if (flag){
    console.log("哈哈哈");
}

document.getElementById("set").innerHTML = "<h2>哇嘎嘎嘎</h2>"

export {
    name,flag
}

require("./css/normal.css")
require("./css/special.less")

import Vue from 'vue'
import app from './vue/App.vue'

new Vue({
    el: '#app',
    template: "<app></app>",
    components:{
        app
    }
})