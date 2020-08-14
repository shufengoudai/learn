<template>
    <div>
        <h2 class="whh">哇哈哈哈哈</h2>
        <p>呵呵呵呵呵呵呵</p>
        <p><button @click="decrement" disabled="this.counter <= 0">-</button>{{counter}}<button @click="increment">+</button></p>
    </div>
</template>

<script>
    export default {
        name: "app",
        data() {
            return{
                message: "hello",
                counter: 0
            }
        },
        methods: {
            increment() {
                this.counter++
            },
            decrement(){
                this.counter--
            }
        }
    }
</script>

<style scoped>
    .whh{
        color: red;
    }
</style>