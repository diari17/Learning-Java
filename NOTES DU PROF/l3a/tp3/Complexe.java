public class Complexe
{
	private float partieReelle, partieImaginaire;

	public Complexe() {}

	public Complexe(float partieReelle, float partieImaginaire)
	{
		this.partieReelle = partieReelle;
		this.partieImaginaire = partieImaginaire;
	}

	public String toString()
	{
		if (this.partieReelle == 0 && this.partieImaginaire == 0)
		{
			return "0";
		}
		else
		{
			String complexe = "";

			if (this.partieReelle != 0)
			{
				complexe += this.partieReelle;

				if (this.partieImaginaire > 0)
				{
					complexe += " + " + this.partieImaginaire + "i";
				}
				else if (this.partieImaginaire < 0)
				{
					complexe += " - " + (-this.partieImaginaire) + "i";
				}
			}
			else
			{
				complexe = this.partieImaginaire + "i";
			}

			complexe = complexe.replace(".0 ", " ").replace(".0i", "i");

			if (complexe.endsWith(".0"))
			{
				complexe = complexe.substring(0, complexe.length() - 2);
			}

			return complexe;
		}
	}
}