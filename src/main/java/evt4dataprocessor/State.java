package evt4dataprocessor;

public enum State {
	STATE_OUT_OF_FRAME,
	STATE_EVT4_FRAME_READOUT_NUMBER,
	STATE_EVT4_FRAME_READOUT_BYTELEN,
	STATE_READOUT_FIND_FRAME_START,
	STATE_READOUT_FRAME_START,
	STATE_READOUT_READ_CONFIG,
	STATE_READOUT_RESUME_READ_CONFIG,
	STATE_READOUT_PROCESS_CONFIG,
	STATE_READOUT_RESUME_READ_CRC,
	STATE_READOUT_PROCESS_CRC,
	STATE_READOUT_SAMPLES_START,
	STATE_READOUT_SAMPLE0,
	STATE_READOUT_SAMPLE1,
	STATE_READOUT_SAMPLE2,
	STATE_READOUT_SAMPLE3,
	STATE_READOUT_FRAME_END
}
