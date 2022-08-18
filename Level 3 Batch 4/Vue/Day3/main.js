const customer = Vue.createApp ({
    data() {
        return {
            age: Number,
            isButtonDisable: true,
            isInputDisable: true,
            mark: 50,
            isActive: true,
            hasError: false,
            students: [
                {name: "Bla Bla", age: 33, gender: "Male"},
                {name: "Sue Sue", age: 44, gender: "Female"},
                {name: "Moe Moe", age: 42, gender: "Cust"},
            ],
        }
    },
    methods: {
        mybtn() {
            if(this.age>=18){
                this.isInputDisable = false;
            }
        },
        ValidityState() {
            console.log("Form validate here!");
        }
    }
})

customer.mount("#ha")