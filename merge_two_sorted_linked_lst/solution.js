var mergeTwoLists = function(l1, l2) {
    if (l1 === null) {
        return l2;
    }
    if (l2 === null) {
        return l1;
    }
    
    if (l1.val < l2.val) {
        l1.next = mergeTwoLists(l1.next, l2);
        return l1;
    }
    else {
        l2.next = mergeTwoLists(l1, l2.next);
        return l2;
    }
};

function ListNode(val, next) {
    this.val = (val === undefined ? 0 : val)
    this.next = (next === undefined ? null : next)
}

let l1 = new ListNode(1);
l1.next = new ListNode(2);
l1.next.next = new ListNode(4);
console.log(l1);

let l2 = new ListNode(1);
l2.next = new ListNode(3);
l2.next.next = new ListNode(4);
console.log(typeof l2);

let merge_l = mergeTwoLists(l1, l2);

let merge_l_ptr = merge_l;

while(merge_l_ptr !== null) {
    console.log(merge_l_ptr.val);
    merge_l_ptr = merge_l_ptr.next;
}