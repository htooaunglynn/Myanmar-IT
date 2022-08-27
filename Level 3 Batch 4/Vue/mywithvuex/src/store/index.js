import { createStore } from 'vuex'

export default createStore({
  state: {
    name: "hal",
    age: 0,
    student: [
      {name: "ss", age: 22},
      {name: "se", age: 44},
      {name: "et", age: 33},
    ]
  },
  getters: {
    adults(state) {
      return state.student.filter(row => row.age >= 19)
    }
  },
  mutations: {
  },
  actions: {
  },
  modules: {
  }
})
