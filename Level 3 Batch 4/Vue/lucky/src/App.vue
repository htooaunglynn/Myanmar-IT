<template>
  <!-- <img alt="Vue logo" src="./assets/logo.png"> -->
  <Testing />
  <!-- <HelloWorld msg="Htoo Aung Lynn"/>  -->
  <Form/>

</template>

<script>
// import HelloWorld from './components/HelloWorld.vue'
import Testing from './components/Testing.vue'
import Form from './components/Form.vue'

export default {
  name: 'App',
  components: {
    // HelloWorld,
    Testing,
    Form
}
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
