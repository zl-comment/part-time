/**
  项目JS主入口
**/    
layui.define(['layer', 'form','element','tree','upload','table','jquery'], function(exports){
  var layer = layui.layer
      ,element = layui.element;
  var a=new Array();    //创建数组
  var myobj={
    addtab:function(url,id,titlename){    //li[lay-id=id]
     // console.log(a);
      if(a.length==0||a[id]==null){    //一开始和已经存在的时候创建tab
        a[id]='tab';
      //  console.log(a);
     /* if($("li[lay-id='"+id+"']").length<1){*/
        element.tabAdd('main_tab', {
          title: titlename
          ,content:  '<iframe style="width: 100%;height: 100%;" onload="setframehieght(this);" data-frameid="' + id + '" scrolling="auto" frameborder="0" src="' + url+ '"></iframe>'
          ,id: id
        });
        element.tabChange('main_tab', id);
      }else{
        element.tabChange('main_tab', id);
      }
    },
    deletetab:function (id){
      a[id]=null;
     // console.log(a[id]);
      element.tabDelete('main_tab',id);
    },
    logout:function(){
      layer.confirm('确定要退出吗？',{
        icon:3,
        btn:['确定','取消'],
        },function(){
          layer.close(layer.index);
          window.location.href="adminlogin.jsp";
        },
        function(){
          alert('已取消');
        }
      );
    }
  };
  
  exports('modules_index', myobj); //注意，这里是模块输出的核心，模块名必须和use时的模块名一致
});
