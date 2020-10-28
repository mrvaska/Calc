public class Parser {

    public void sch(String qwest) throws Exception {


        if (qwest.indexOf("/") >= 1) {

            String[] result = qwest.split("\\/",2);

            String res1 = result[0];
            String res2 = result[1];



            Pars pr = new Pars();

            int a = pr.prs1(res1);
            int b = pr.prs1(res2);
            int k = pr.sh();

            Schet s = new Schet();
            if (k ==2)
                System.out.println("Output:\n"+ pr.prs3(s.delenee(a, b)));
            else
            System.out.println("Output:\n" + s.delenee(a, b));
        } else if (qwest.indexOf("*") >= 1) {

            String[] result = qwest.split("\\*",2);

            String res1 = result[0];
            String res2 = result[1];


            Pars pr = new Pars();

            int a = pr.prs1(res1);
            int b = pr.prs1(res2);
            int k = pr.sh();

            Schet s = new Schet();
            if (k ==2)
                System.out.println("Output:\n"+ pr.prs3(s.mnoj(a, b)));
            else
            System.out.println("Output:\n" + s.mnoj(a, b));
        } else if (qwest.indexOf("-") >= 1) {

            String[] result = qwest.split("\\-",2);

            String res1 = result[0];
            String res2 = result[1];


            Pars pr = new Pars();

            int a = pr.prs1(res1);
            int b = pr.prs1(res2);
            int k = pr.sh();

            Schet s = new Schet();
            if (k ==2)
                System.out.println("Output:\n"+ pr.prs3(s.raznost(a, b)));
            else
            System.out.println("Output:\n" + s.raznost(a, b));
        } else if (qwest.indexOf("+") >= 1) {


            String[] result = qwest.split("\\+",2);
            String res1 = result[0];
            String res2 = result[1];


            Pars pr = new Pars();

            int a = pr.prs1(res1);
            int b = pr.prs1(res2);
            int k = pr.sh();

            Schet s = new Schet();
            if (k ==2)
                System.out.println("Output:\n"+ pr.prs3(s.summa(a, b)));
            else
            System.out.println("Output:\n" + s.summa(a, b));
        } else {
            throw new Exception();
        }

    }


}