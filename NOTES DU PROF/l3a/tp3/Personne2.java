public class Personne2
{
	private String nom, prenom, sexe;
	private int age;

	public Personne2()
	{}

	public Personne2(String nom, String prenom)
	{
		this.nom = nom;
		this.prenom = prenom;
	}

	public Personne2(String nom, String prenom, int age)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.setAge(age);
	}

	public Personne2(String nom, String prenom, int age, String sexe)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.setAge(age);
		this.setSexe(sexe);
	}

	public Personne2(Personne2 p)
	{
		this.nom = p.nom;
		this.prenom = p.prenom;
		this.setAge(p.age);
		this.setSexe(p.sexe);
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
}