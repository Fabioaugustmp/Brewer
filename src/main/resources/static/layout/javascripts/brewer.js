$(function(){
    var decimal = $('.js-decimal');
    decimal.maskMoney({decimal: ',', thousands: '.'});

    var plain = $('.js-plain');
    plain.maskMoney({ precision: 0, thousands: '.' });

    $('#modalCadastroRapidoEstilo').on('shown.bs.modal', function () {
        $('#meuInput').trigger('focus')
      })
});