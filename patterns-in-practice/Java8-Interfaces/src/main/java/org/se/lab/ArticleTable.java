package org.se.lab;

import java.util.List;

public interface ArticleTable
{
    void insert(Article a);
    void update(Article a);
    void delete(Article a);
    
    Article findById(int id);
    List<Article> findAll();
    
    
    static ArticleTable createNewTable()
    {
        return new ArticleTableInMemoryImpl();
    }


    public abstract class ArticleTableDecorator
        implements ArticleTable
    {
        private final ArticleTable table;
        
        public ArticleTableDecorator(ArticleTable table)
        {
            if(table == null)
                throw new IllegalArgumentException();
            this.table = table;
        }
        
        @Override
        public void insert(Article a)
        {
            table.insert(a);        
        }

        @Override
        public void update(Article a)
        {
            table.update(a);        
        }

        @Override
        public void delete(Article a)
        {
            table.delete(a);        
        }

        @Override
        public Article findById(int id)
        {
            return table.findById(id);
        }

        @Override
        public List<Article> findAll()
        {
            return table.findAll();
        }
    }
}
