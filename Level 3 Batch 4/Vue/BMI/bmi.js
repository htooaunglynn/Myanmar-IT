const bmi = Vue.createApp({
    data() {
        return {
            bmi_cate: "<h4>BMI Categories:</h4>",
            underweight: "<span style='color: blue;'>Underweight = <18.5</span>",
            normalweight: "<span style='color: green;'>Normal weight = 18.5–24.9</span>",
            overweight: "<span style='color: orange;'>Overweight = 25–29.9</span>",
            obesity: "<span style='color: red;'>Obesity = BMI of 30 or greater</span>",
            ft: "",
            inches: "",
            pd: "",
            yourBMI: 0,
            blue: false,
            green: false,
            orange: false,
            red: false
        }
    },
    methods: {
        calculateBMI(){
            this.yourBMI = (this.pd / 2.2) / (((((this.ft * 12) + this.inches) * 2.54) / 100) * ((((this.ft * 12) + this.inches) * 2.54) / 100));
            
            if(this.yourBMI < 18.5) {
                this.blue = true;

                this.green = false;
                this.orange = false;
                this.red = false;
            } else if(this.yourBMI >= 18.5 && this.yourBMI <= 24.9) {
                this.green = true;

                this.blue = false;
                this.orange = false;
                this.red = false;
            } else if(this.yourBMI >= 25 &&  this.yourBMI <= 29.9) {
                this.orange = true;

                this.green = false;
                this.blue = false;
                this.red = false;
            } else if(this.yourBMI >= 30) {
                this.red = true;

                this.green = false;
                this.orange = false;
                this.blue = false;
            }
        }
    }
})