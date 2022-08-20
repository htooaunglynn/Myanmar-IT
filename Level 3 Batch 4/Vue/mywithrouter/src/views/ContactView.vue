<template>
  <div class="contact">
    <h1>This is an contact page</h1>
  </div>

  <div class="container">
    <div class="row">
      <div class="col-12 col-lg-3" v-for="(item, index) in memes" :key="index">
        <div class="card">
          <img :src="item.url" class="card-img-top w-50 h-50" alt="...">
          <div class="card-body">
            <p class="card-text">{{item.name}}</p>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>


<script>
const axios = require('axios');
export default {
  name: 'ContactView',
  data() {
    return { 
      memes: []
    }
  },
  mounted() {
    axios.get('/get_memes')
    .then(response => {
      //console.log(response)
      this.memes = response.data.data.memes
    })
  },
  methods() {

  }
}
</script>