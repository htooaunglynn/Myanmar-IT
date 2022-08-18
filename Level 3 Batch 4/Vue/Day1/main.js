const app = Vue.createApp({
    data() {
    return {
        message: '<h3 style="color: red;"> Hello Vue!</h3>',
        name: 'Htoo Aung Lynn',
        age: 22,
        photo: "tos.webp",
        seen: true,
        colors: ['red', 'green', 'blude'],
        students: [
            {name: 'Mg Mg', age: 22, gender: 'male'},
            {name: "su su", age: 23, gender: 'female'},
            {name: 'Bo Bo', age: 20, gender: 'male'},
        ]
    }
    },
    methods:{
        openalert(msg){
            //alert(this.name)
            alert(msg)
        }
    }
});