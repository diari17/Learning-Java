public class Personne
{
	private String nom, prenom, sexe;
	private int age;

	public Personne()
	{}

	public Personne(String nom, String prenom)
	{
		this(nom, prenom, 0, null);
	}

	public Personne(String nom, String prenom, int age)
	{
		this(nom, prenom, age, null);
	}

	public Personne(String nom, String prenom, int age, String sexe)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.setAge(age);
		this.setSexe(sexe);
	}

	public Personne(Personne p)
	{
		this(p.nom, p.prenom, p.age, p.sexe);
	}

	public String getNom()
	{
		return this.nom;
	}

	public void setNom(String nom)
	{
		this.nom = nom;
	}

	public String getPrenom()
	{
		return this.prenom;
	}

	public void setPrenom(String prenom)
	{
		this.prenom = prenom;
	}

	public int getAge()
	{
		return this.age;
	}

	public void setAge(int age)
	{
		if (age >= 0 && age <= 130)
		{
			this.age = age;
		}
		else
		{
			System.err.println("erreur : age incorrect");
		}
	}

	public String getSexe()
	{
		return this.sexe;
	}

	public void setSexe(String sexe)
	{
		if (sexe == null || sexe.equals("MASCULIN") || sexe.equals("FEMININ"))
		{
			this.sexe = sexe;
		}
		else
		{
			System.err.println("erreur : sexe incorrect");
		}
	}

	public String toString()
	{
		// return (
		// 	"Prénom : " + this.prenom + "\n" +
		// 	"Nom    : " + this.nom + "\n" +
		// 	"Age    : " + this.age + "\n" +
		// 	"Sexe   : " + this.sexe
		// );

		return String.format(
			"Prénom : %s\n" +
			"Nom    : %s\n" +
			"Age    : %d ans\n" +
			"Sexe   : %s", this.prenom, this.nom, this.age, this.sexe
		);
	}
}