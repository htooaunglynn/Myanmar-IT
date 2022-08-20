<template>
    <!-- <button @click="reverse">Reverse</button> -->
    <!-- <h1 class="name">{{name}}</h1> -->
    <!-- <div class="div_red"></div>
    <div class="div_aq"></div> -->
    

    <button class="btn btn-primary shadow-lg p-3 mb-5 bg-danger rounded" data-bs-target="#collapseTarget" data-bs-toggle="collapse">
        Bootstrap collapse
    </button>
    <div class="alert alert-success collapse py-2" id="collapseTarget">This is a sweet success message</div>
    <br><br><br>
</template>

<script>
    export default {
    name: 'TestingPart', //two name
        data() {
            return {
                name: "Htoo Aung Lynn"
            }
        },
        methods: {
            reverse() {
                this.name = this.name.split('').reverse('').join('');
            }
        }
    }
</script>

<style>
.name{
    color: lightcoral;
}
.div_red{
    width: 100px;
    height: 100px;
    background-color: red;
}
.div_aq{
    width: 100px;
    height: 100px;
    background-color: aqua;
}
</style>