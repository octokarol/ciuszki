function changeSizeType() {
    var itemModelSelect=document.getElementById("itemModelSelect");
    var item;
    var isShoe;
    for(item of itemModelSelect)
    {
        if(item.selected)
        {
            isShoe=item.getAttribute("data-is_shoe");
            break;
        }
    }
    if(isShoe==="true")
    {
        document.getElementById("otherSize").style.display = "none";
        document.getElementById("shoeSize").style.display = "initial";
    }
    else if(isShoe==="false")
    {
        document.getElementById("otherSize").style.display = "initial";
        document.getElementById("shoeSize").style.display = "none";
    }
}