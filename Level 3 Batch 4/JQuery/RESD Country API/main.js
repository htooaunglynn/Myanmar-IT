$(function() { 
    $("#one_country").hide();

    $.get("https://restcountries.com/v3.1/all", function (params) {
        let data = "";
        $(params).each(function (i, v) {
            data += `
            <div class="col-12 col-xs-12 col-sm-12 col-md-6 col-lg-4 col-xl-3 col-xxl-3">
                <a href="#" class="my-5 mx-5" data-index="${i}">
                    <div class="card p-3">
                            <img src="${v.flags.svg}" height="161" class="card-img-top">
                        <div class="card-body">
                            <p class="card-text">
                                <section> <span><b>Country :</b></span> <span>${v.name.common}</span> </section>
                                <section> <span><b>Region :</b></span> <span>${v.region}</span> </section>
                                <section> <span><b>Population :</b></span> <span>${v.population}</span> </section>
                            </p>
                        </div>
                    </div>
                </a>
            </div>
            
            `;
            $("#coll_country").html(data);
        })
        
    });   
    
    $("#coll_country").on("click", "a" , function(e) {
        $("#one_country").show();
        $("#all_country").hide();

        e.preventDefault();
        let id = $(this).data("index");
        //console.log(id)

        $.get("https://restcountries.com/v3.1/all", function (params) {
            let data = ``;
            // console.log(params[id])

            data += `
                <div class="card mb-3 mt-5">
                    <div class="row g-0">
                        <div class="col-md-4">
                        <img src="${params[id].flags.png}" class="img-fluid rounded-start mt-5 ps-4" alt="...">
                        </div>
                        <div class="col-md-8">
                        <div class="card-body row">
                            <div class="col-6">
                                <h5 class="card-title mb-3">${params[id].name.common}</h5>
                                <section class="card-text">
                                    <p><span><b>Official Name : </b></span><span>${params[id].name.official}</span></p>
                                    <p><span><b>Population : </b></span><span>${params[id].population}</span></p>
                                    <p><span><b>Region : </b></span><span>${params[id].region}</span></p>
                                    <p><span><b>Sub region : </b></span><span>${params[id].subregion}</span></p>
                                    <p><span><b>Capital : </b></span><span>${params[id].capital}</span></p>
                                </section>
                            </div>
                            <div class="col-6 mt-5">
                                <section class="card-text">
                                    <p><span><b>Languages : </b></span><span>${params[id].languages.ara}</span></p>
                                    <p><span><b>Area : </b></span><span>${params[id].area}</span></p>
                                </section>
                            </div>                            
                        </div>
                        </div>
                    </div>
                </div>
            `;
            $("#one_country_data").html(data);
        })
    })
    
    $("#back").on("click", function() {
        $("#one_country").hide();
        $("#all_country").show();
    })
})