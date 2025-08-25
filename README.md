# Hash Functions Lab 🔑

Este repositório é um laboratório pessoal para estudar e testar **funções de hash** em Java.  
O objetivo é implementar diferentes funções de hash, analisar seu espalhamento e exportar resultados para visualização em R.

---

## 📌 Funções de Hash Implementadas
- [x] Shift-XOR Hash (deslocamento e XOR)
- [ ] Divisão (`h(k) = k mod m`)
- [ ] Multiplicação
- [ ] Folding
- [ ] TCR (Teorema Chinês do Resto)

---

## ⚙️ Estrutura do Repositório

hash-lab/
├── src/ # Código fonte em Java
│ ├── HashFunctions.java
│ ├── TabelaHash.java
│ └── Testes.java
├── resultados/ # Arquivos CSV com métricas
├── r/ # Scripts em R para análise e gráficos
│ └── analise.R
└── README.md # Este arquivo
