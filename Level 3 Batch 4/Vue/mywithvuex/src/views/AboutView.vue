<template>
  <div class="about">
    <h1>This is an about page</h1>
    {{ this.$store.state.age }}
    <button @click="increase">+</button>
    {{adults}}
  </div>
</template>

<script>

export default {
  data() {
    return {
      adults: this.$store.getters.adults
    }
  },
  methods: {
    increase() {
      this.$store.state.age++
    }
  }  
}
</script>