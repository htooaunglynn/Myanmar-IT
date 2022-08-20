import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import "bootstrap/dist/css/bootstrap.min.css"
import "bootstrap/dist/js/bootstrap.bundle.min.js"
const axios = require('axios').default;
axios.defaults.baseURL = 'https://api.imgflip.com';

createApp(App).use(router,axios).mount('#app')
