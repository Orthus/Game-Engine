public class Entity {
	String data_id = "tb01";
	String data_name = "Test Bed Mob";
	String data_type = "Normal";
	String data_subtype = null;
	float stat_level = 100;
	float stat_health = 10000;
	float stat_attack = 100;
	float stat_defense = 100;
	float stat_speed = 100;
	float growth_health = 1;
	float growth_attack = 1000;
	float growth_defense = 0;
	float growth_speed = 0;
	public void Entity(String data_id) {
		if (data_id != "tb01" && data_id.isEmpty() == false) {
			// use id to load xml information
			Object entity_info;
			entity_info = new XML_Handler.Read_Mon(data_id);
		}
		else {
			
		}
	}

}
