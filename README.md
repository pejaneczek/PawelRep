# PawelRep
Repository
   var test = Ext.create('Ext.form.Panel', {
            title: 'Upload a Photo',
            width: 600,
            bodyPadding: 10,
            frame: true,
            renderTo: Ext.getBody(),
            items: [{
                    xtype: 'filefield',
                    id: 'inputFile',
                    name: 'uploaded',
                    buttonText: 'Select Photo...',
                    listeners: {
                    change: function () {
                    var id = this.getId();
                    itemFile = Ext.getCmp(id);
                        var files = itemFile.fileInputEl.dom.files;
                    if (!files.length) {
                            alert('Proszę wybrać plik...');
                    return;
                    } else {
                        var fileToRead = files[0];
                        var reader = new FileReader();
                        reader.readAsText(fileToRead, "UTF-8");
                        reader.onload = loaded;
                        reader.error = errorHandler;
            }
                    
                }
            }
                }]
        
        }); 
        function loaded(event) {
            var fileString = event.target.result;
            console.log(fileString);
        }
        function errorHandler(event) {
            if (event.target.error.name === "NotReadableError") {
            }
        }
