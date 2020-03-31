package helloWorld;

//abstract class Sequence,which represents a data string of any type specified by a parameter template.
public abstract class Sequence <T> extends Packet{
	protected int channelNr; //channel number
	protected String unit; //unit of measured value
	protected double resolution; //resolution in time domain or other
	protected T[] buffer; //T-type data table
	
	//constructor
	public Sequence(String _device, String _description, long _date, int _channelNr, String _unit, double _resolution, T[] _table){
		super(_device, _description, _date);
		this.channelNr = _channelNr;
		this.unit = _unit;
		this.resolution = _resolution;
		this.buffer = _table;
		}
	// method returning a string containing the object's attribute values
	public String toString(){
		String result_pack;
		String result_seq; result_pack = super.toString();
		String temp = "";
		for (int i = 0; i < buffer.length; i++){
			temp = temp + buffer[i] + ", ";
			}
		result_seq = result_pack + ", \nChannel Number = " + channelNr + ", \nUnit = " + unit + ", \nResolution = " + resolution + ", \nBuffer = " + temp;
		return result_seq;
		}
}
