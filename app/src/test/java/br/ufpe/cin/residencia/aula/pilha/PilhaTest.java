package br.ufpe.cin.residencia.aula.pilha;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PilhaTest {
    private IPilha<Integer> pilha;
    private final static int TAMANHO_PILHA = 3;
    private final static int ELEMENTO_1 = 11;
    private final static int ELEMENTO_2 = 12;
    private final static int ELEMENTO_3 = 13;
    private final static int ELEMENTO_4 = 14;
    private final static int ELEMENTO_5 = 15;

    @BeforeAll
    static void setupClass() {
        System.out.println("Isso aqui executa uma única vez antes do primeiro método de teste iniciar a sua execução.");
    }
    @AfterAll
    static void tearDownClass() {
        System.out.println("Isso aqui executa uma única vez após todos os métodos de teste da suíte encerrarem a sua execução.");
    }

    //Fixtures
    @BeforeEach
    void setup() {
        System.out.println("Isso aqui executa antes de cada método de teste iniciar a sua execução.");
        pilha = new Pilha<>(TAMANHO_PILHA);
    }

    @AfterEach
    void tearDown() {
        pilha = null;
        System.out.println("Isso aqui executa após cada método de teste terminar a sua execução.");
        System.out.println();
    }


    @Test
    void tamanho() {
        int tamanhoOriginal = pilha.tamanho();
        pilha.inserir(12);
        int novoTamanho = tamanhoOriginal+1;
        assertEquals(
                novoTamanho,
                pilha.tamanho(),
                "Tamanho deveria ser incrementado em 1 após uma inserção"
        );
    }

    @Test
    void tamanhoAumentaEmDois() {
        IPilha<Integer> pilha = new Pilha<>();
        int tamanhoOriginal = pilha.tamanho();
        pilha.inserir(12);
        pilha.inserir(13);
        int novoTamanho = tamanhoOriginal+2;
        assertEquals(
                novoTamanho,
                pilha.tamanho(),
                "Tamanho deveria ser incrementado em 2 após duas inserções"
        );
    }

    @Test
    void inserir() {
        pilha.inserir(ELEMENTO_1);
        assertEquals(
                ELEMENTO_1,
                pilha.topo(),
                "O elemento inserido deveria estar no topo da pilha"
        );
    }

    @Test
    @DisplayName("Inserir mais elementos do que a capacidade da pilha dispara exceção OverflowStackException")
    void inserirMaisElementosQueCapacidade() {
        assertThrows(
                OverflowStackException.class,
                () -> {
                    pilha.inserir(ELEMENTO_1);
                    pilha.inserir(ELEMENTO_2);
                    pilha.inserir(ELEMENTO_3);
                    pilha.inserir(ELEMENTO_4);
                }
        );
    }

    @Test
    @DisplayName("Inserir elementos até a capacidade da pilha *NÃO* dispara exceção OverflowStackException")
    void inserirElementosAteCapacidade() {
        assertDoesNotThrow(
                () -> {
                    pilha.inserir(ELEMENTO_1);
                    pilha.inserir(ELEMENTO_2);
                    pilha.inserir(ELEMENTO_3);
                }
        );
    }

    @Test
    void remover() {
        pilha.inserir(ELEMENTO_1);
        pilha.inserir(ELEMENTO_2);
        pilha.inserir(ELEMENTO_3);
        assertEquals(
                ELEMENTO_3,
                pilha.remover(),
                "Elemento recém-inserido deveria ser o que é retornado"
        );
    }

    @Test
    void removerElementoPilhaVazia() {
        UnderflowStackException e = assertThrows(
                UnderflowStackException.class,
                () -> pilha.remover()
        );
        assertEquals("Underflow da pilha", e.getMessage());
    }

    @Test
    @DisplayName("Uma pilha recém-criada deve estar vazia")
    void pilhaInicialmenteVazia() {
        assertTrue(pilha.vazia());
    }


    @Test
    @DisplayName("Uma pilha não deve estar vazia após inserção de um elemento")
    void pilhaAposInsercaoNaoVazia() {
        pilha.inserir(ELEMENTO_2);
        assertFalse(pilha.vazia());
    }

    @Test
    void topo() {
        pilha.inserir(ELEMENTO_1);
        pilha.inserir(ELEMENTO_2);
        assertEquals(
                ELEMENTO_2,
                pilha.topo(),
                "Elemento recém-inserido deveria ser o que é retornado"
        );
    }
}