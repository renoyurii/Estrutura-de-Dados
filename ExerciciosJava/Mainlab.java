import java.util.*;

public class MainLab {

    public static void main(String[] args) {
        System.out.println("Bloco A");
        blocoA1();
        blocoA2();

        System.out.println();
        System.out.println("Bloco B");
        blocoB1();
        blocoB2();

        System.out.println();
        System.out.println("Bloco C");
        blocoC1();
        blocoC2();

        System.out.println();
        System.out.println("Bloco D");
        blocoD1();
        blocoD2();

        System.out.println();
        System.out.println("Bloco E");
        blocoE1();
        blocoE2();
    }

    private static void blocoA1() {
        System.out.println("Tarefa A1");

        List<Integer> numeros = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9));
        System.out.println("Lista original: " + numeros);

        Collections.sort(numeros);
        System.out.println("Ordenada (sort): " + numeros);

        int posicao = Collections.binarySearch(numeros, 8);
        System.out.println("Posicao do 8 (binarySearch): " + posicao);

        Collections.reverse(numeros);
        System.out.println("Apos reverse: " + numeros);

        Collections.shuffle(numeros);
        System.out.println("Apos shuffle: " + numeros);
    }

    private static void blocoA2() {
        System.out.println();
        System.out.println("Tarefa A2");

        List<String> l1 = new ArrayList<>(Arrays.asList("Java", "Python", "C++"));
        List<String> l2 = new ArrayList<>(Arrays.asList("C#", "Java", "Go"));

        System.out.println("l1: " + l1);
        System.out.println("l2: " + l2);

        Collections.addAll(l1, "Kotlin", "Swift");
        System.out.println("l1 apos addAll: " + l1);

        int freqJava = Collections.frequency(l1, "Java");
        System.out.println("frequency de \"Java\" em l1: " + freqJava);

        boolean disjuntas = Collections.disjoint(l1, l2);
        System.out.println("l1 e l2 sao disjuntas? " + disjuntas);

        List<Integer> outraLista = Arrays.asList(10, 2, 30, 5, 1);
        int min = Collections.min(outraLista);
        int max = Collections.max(outraLista);
        System.out.println("Outra lista: " + outraLista);
        System.out.println("min: " + min + ", max: " + max);
    }

    private static void blocoB1() {
        System.out.println("Tarefa B1");

        String[] expressoes = {
                "((2+3)*(4-1))",
                ")(2+3)(",
                "(1+(2*3)"
        };

        for (String e : expressoes) {
            boolean ok = parentesesBalanceados(e);
            System.out.println(e + " -> " + (ok ? "Balanceada" : "Desbalanceada"));
        }
    }

    private static boolean parentesesBalanceados(String expressao) {
        Stack<Character> pilha = new Stack<>();

        for (char c : expressao.toCharArray()) {
            if (c == '(') {
                pilha.push(c);
            } else if (c == ')') {
                if (pilha.isEmpty()) {
                    return false;
                }
                pilha.pop();
            }
        }

        return pilha.isEmpty();
    }

    private static void blocoB2() {
        System.out.println();
        System.out.println("Tarefa B2");

        String palavra = "ALGORITMO";
        String invertida = inverterComPilha(palavra);
        System.out.println("Palavra original: " + palavra);
        System.out.println("Invertida: " + invertida);
    }

    private static String inverterComPilha(String palavra) {
        Stack<Character> pilha = new Stack<>();
        for (char c : palavra.toCharArray()) {
            pilha.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while (!pilha.isEmpty()) {
            sb.append(pilha.pop());
        }
        return sb.toString();
    }

    private static void blocoC1() {
        System.out.println("Tarefa C1");

        Queue<String> fila = new LinkedList<>();

        fila.offer("Doc1");
        System.out.println("Apos enfileirar Doc1: " + fila);

        fila.offer("Doc2");
        System.out.println("Apos enfileirar Doc2: " + fila);

        fila.offer("Doc3");
        System.out.println("Apos enfileirar Doc3: " + fila);

        fila.poll();
        System.out.println("Apos remover um (poll): " + fila);

        fila.poll();
        System.out.println("Apos remover outro (poll): " + fila);

        fila.offer("Doc4");
        System.out.println("Apos enfileirar Doc4: " + fila);

        System.out.println("peek: " + fila.peek());
        System.out.println("size: " + fila.size());

        fila.clear();
        System.out.println("Apos clear: " + fila);
    }

    private static void blocoC2() {
        System.out.println();
        System.out.println("Tarefa C2");

        PriorityQueue<Integer> filaPrioridade = new PriorityQueue<>();
        filaPrioridade.offer(30);
        filaPrioridade.offer(10);
        filaPrioridade.offer(20);
        filaPrioridade.offer(40);

        System.out.println("PriorityQueue (interno): " + filaPrioridade);
        System.out.println("peek (menor valor): " + filaPrioridade.peek());

        System.out.print("Removendo em ordem: ");
        while (!filaPrioridade.isEmpty()) {
            System.out.print(filaPrioridade.poll() + " ");
        }
        System.out.println();
    }

    private static void blocoD1() {
        System.out.println("Tarefa D1");

        Set<String> linguagens = new HashSet<>();
        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("C++");
        linguagens.add("Java");

        System.out.println("HashSet: " + linguagens);

        TreeSet<Integer> numeros = new TreeSet<>();
        numeros.add(10);
        numeros.add(5);
        numeros.add(8);
        numeros.add(1);

        System.out.println("TreeSet: " + numeros);
        System.out.println("headSet(8): " + numeros.headSet(8));
        System.out.println("tailSet(8): " + numeros.tailSet(8));
    }

    private static void blocoD2() {
        System.out.println();
        System.out.println("Tarefa D2");

        Map<String, Integer> notas = new HashMap<>();
        notas.put("Ana", 90);
        notas.put("Carlos", 80);
        notas.put("Bianca", 85);

        System.out.println("Nota da Ana: " + notas.get("Ana"));
        System.out.println("keySet: " + notas.keySet());
        System.out.println("size: " + notas.size());

        Map<String, Integer> ordenado = new TreeMap<>(notas);
        System.out.println("TreeMap ordenado: " + ordenado);
    }

    private static void blocoE1() {
        System.out.println("Tarefa E1 - Lista Encadeada");

        ListaEncadeada lista = new ListaEncadeada();
        lista.insertAtFront(3);
        lista.insertAtFront(2);
        lista.insertAtFront(1);
        lista.insertAtBack(4);
        lista.insertAtBack(5);

        System.out.print("Lista apos insercoes: ");
        lista.print();

        lista.removeFromFront();
        System.out.print("Apos removeFromFront: ");
        lista.print();

        lista.removeFromBack();
        System.out.print("Apos removeFromBack: ");
        lista.print();
    }

    private static void blocoE2() {
        System.out.println();
        System.out.println("Tarefa E2 - Arvore de Busca");

        ArvoreBST arvore = new ArvoreBST();
        int[] valores = {8, 3, 10, 1, 6, 14, 4, 7, 13};

        for (int v : valores) {
            arvore.inserir(v);
        }

        System.out.print("In-order: ");
        arvore.inOrder();

        System.out.print("Pre-order: ");
        arvore.preOrder();

        System.out.print("Post-order: ");
        arvore.postOrder();
    }

    private static class NoLista {
        int dado;
        NoLista proximo;

        NoLista(int dado) {
            this.dado = dado;
        }
    }

    private static class ListaEncadeada {
        private NoLista inicio;
        private NoLista fim;

        public void insertAtFront(int valor) {
            NoLista novo = new NoLista(valor);
            if (inicio == null) {
                inicio = fim = novo;
            } else {
                novo.proximo = inicio;
                inicio = novo;
            }
        }

        public void insertAtBack(int valor) {
            NoLista novo = new NoLista(valor);
            if (inicio == null) {
                inicio = fim = novo;
            } else {
                fim.proximo = novo;
                fim = novo;
            }
        }

        public void removeFromFront() {
            if (inicio == null) {
                return;
            }
            inicio = inicio.proximo;
            if (inicio == null) {
                fim = null;
            }
        }

        public void removeFromBack() {
            if (inicio == null) {
                return;
            }
            if (inicio == fim) {
                inicio = fim = null;
                return;
            }
            NoLista atual = inicio;
            while (atual.proximo != fim) {
                atual = atual.proximo;
            }
            atual.proximo = null;
            fim = atual;
        }

        public void print() {
            NoLista atual = inicio;
            while (atual != null) {
                System.out.print(atual.dado + " ");
                atual = atual.proximo;
            }
            System.out.println();
        }
    }

    private static class NoArvore {
        int valor;
        NoArvore esq;
        NoArvore dir;

        NoArvore(int valor) {
            this.valor = valor;
        }
    }

    private static class ArvoreBST {
        private NoArvore raiz;

        public void inserir(int valor) {
            raiz = inserirRec(raiz, valor);
        }

        private NoArvore inserirRec(NoArvore atual, int valor) {
            if (atual == null) {
                return new NoArvore(valor);
            }
            if (valor < atual.valor) {
                atual.esq = inserirRec(atual.esq, valor);
            } else if (valor > atual.valor) {
                atual.dir = inserirRec(atual.dir, valor);
            }
            return atual;
        }

        public void inOrder() {
            inOrderRec(raiz);
            System.out.println();
        }

        private void inOrderRec(NoArvore no) {
            if (no == null) {
                return;
            }
            inOrderRec(no.esq);
            System.out.print(no.valor + " ");
            inOrderRec(no.dir);
        }

        public void preOrder() {
            preOrderRec(raiz);
            System.out.println();
        }

        private void preOrderRec(NoArvore no) {
            if (no == null) {
                return;
            }
            System.out.print(no.valor + " ");
            preOrderRec(no.esq);
            preOrderRec(no.dir);
        }

        public void postOrder() {
            postOrderRec(raiz);
            System.out.println();
        }

        private void postOrderRec(NoArvore no) {
            if (no == null) {
                return;
            }
            postOrderRec(no.esq);
            postOrderRec(no.dir);
            System.out.print(no.valor + " ");
        }
    }
}
