class PrefixTree {
    constructor() {

        this.root={};
    }

    /**
     * @param {string} word
     * @return {void}
     */

    //    a
    // p   n
    //p     t
    insert(word) {
        let node =this.root;
        for(let c of word){
            //If node doesnt have a child c then create it
            if(!(c in node)){
                node[c] = {};
            }
            node = node[c];
        }
        node.isWordEnd=true;
    }

    /**
     * @param {string} word
     * @return {boolean}
     */
    search(word) {
        let node =this.root;
        for(let c of word){
            if(!(c in node)) return false;
            node = node[c];
        }
        //Word id found only if isWordEnd is true
        return !!node.isWordEnd;
    }

    /**
     * @param {string} prefix
     * @return {boolean}
     */
    startsWith(prefix) {
        let node =this.root;
        for(let c of prefix){
            if(!(c in node))return false; //character path is missing
            node = node[c];
        }
        return true;
    }
}
