using NUnit.Framework;
using System;

namespace CBingo
{
	[TestFixture()]
	public class EspeakHelperTest
	{
		[Test()]
		public void ToEspeak ()
		{
			Assert.AreEqual ("'1'", EspeakHelper.ToEspeak (1));
			Assert.AreEqual ("'9'", EspeakHelper.ToEspeak (9));
		}
	}
}

