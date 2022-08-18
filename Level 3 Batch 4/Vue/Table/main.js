const table = Vue.createApp ({
    data() {
        return {
            students: [
                {name: "Bla Bla", age: 33, gender: "Male"},
                {name: "Sue Sue", age: 44, gender: "Female"},
                {name: "Moe Moe", age: 42, gender: "Cust"}
            ],            
        }
    },
    methods: {
        detail_btn(index) {
            --index;
            alert(`Name : ${this.students[index].name} \nAge: ${this.students[index].age} \nGender: ${this.students[index].gender}`);
        }
    }
})

table.mount("#app")