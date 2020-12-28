import { Accordion, Card } from 'react-bootstrap';
import Chapter from './Chapter';

const Journey = ({chapters}) => 
    <div id="display">
            <Accordion defaultActiveKey="Origin">
            { chapters.map(chapter => ( 
                <Card>
                    <Card.Header>
                    <Accordion.Toggle as={Card.Header} variant="link" eventKey={ chapter.number }>
                    { chapter.number } { chapter.title }
                    </Accordion.Toggle>
                    </Card.Header>
                    <Accordion.Collapse eventKey={ chapter.number }>
                    <Card.Body>
                        <Chapter {...chapter} />
                    </Card.Body>
                    </Accordion.Collapse>
                </Card>
            ))}
        </Accordion>
    </div>

export default Journey;